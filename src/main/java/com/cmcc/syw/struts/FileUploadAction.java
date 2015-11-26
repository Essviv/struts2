package com.cmcc.syw.struts;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by sunyiwei on 2015/11/26.
 */
public class FileUploadAction {
    private File myFile;
    private String myFileContentType;
    private String myFileFileName;

    public String execute(){
        final String dstDir = "C:\\Users\\Lenovo\\Desktop\\test";

        try {
            FileUtils.copyFile(myFile, new File(dstDir, myFileFileName));
            return "uploadSuccess";
        } catch (IOException e) {
            return "uploadFail";
        }
    }

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }
}
