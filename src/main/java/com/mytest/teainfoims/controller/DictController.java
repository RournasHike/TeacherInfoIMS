package com.mytest.teainfoims.controller;

import com.mytest.teainfoims.common.DictDto;
import com.mytest.teainfoims.common.ResultInfo;
import com.mytest.teainfoims.controller.base.BaseController;
import com.mytest.teainfoims.service.DictService;
import com.mytest.teainfoims.vo.TDict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/4
 */
@Controller
@RequestMapping("dict")
public class DictController extends BaseController {

    @Resource
    private DictService dictService;

    @RequestMapping("listPage")
    public String moduleList(){
        return "admin/dict/dict";
    }

    @RequestMapping("list")
    @ResponseBody
    public Map<String,Object> queryDictList() {
        return dictService.queryDictList();
    }

    @RequestMapping("toAddDictPage")
    public String toAddDictPage(Integer parentId, Integer isDict,Model model){

        DictDto dictDto=new DictDto();
        dictDto.setIsDict(isDict);
        dictDto.setParentId(parentId);
        model.addAttribute("dictDto",dictDto);
        return "admin/dict/add";
    }

    @RequestMapping("toUpdateDictPage")
    public String toUpdateDictPage(Integer id,Model model){
        TDict dict = dictService.getDictById(id);
        model.addAttribute("dict",dict);
        return "admin/dict/update";
    }

    @RequestMapping("add")
    @ResponseBody
    public ResultInfo addDict(TDict tDict){
        ResultInfo resultInfo = new ResultInfo();
        if(tDict.getVal().equals("")||tDict.getVal()==null){
            tDict.setVal(null);
        }
        dictService.addDict(tDict);
        return resultInfo;
    }

    @RequestMapping("update")
    @ResponseBody
    public ResultInfo updateDict(TDict tDict){
        ResultInfo resultInfo = new ResultInfo();
        dictService.updateDict(tDict);
        return resultInfo;
    }

    @RequestMapping("delete")
    @ResponseBody
    public ResultInfo deleteDict(Integer id,Integer parentId){
        ResultInfo resultInfo = new ResultInfo();
        dictService.deleteDict(id,parentId);
        return resultInfo;
    }
}
