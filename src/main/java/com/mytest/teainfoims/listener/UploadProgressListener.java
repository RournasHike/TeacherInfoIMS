package com.mytest.teainfoims.listener;



import com.mytest.teainfoims.entity.UserEntity;
import org.apache.commons.fileupload.ProgressListener;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/28
 */
@Component
public class UploadProgressListener implements ProgressListener {
    private HttpSession session;

    public void  setSession(HttpSession session){
        this.session=session;
        UserEntity userEntity=new UserEntity();
        session.setAttribute("uploadStatus",userEntity);

    }

    @Override
    public void update(long readBytes,long allBytes,int index) {
        UserEntity userEntity=(UserEntity) session.getAttribute("uploadStatus");
        userEntity.setReadBytes(readBytes);
        userEntity.setAllBytes(allBytes);
        userEntity.setCurrentIndex(index);
    }
}
