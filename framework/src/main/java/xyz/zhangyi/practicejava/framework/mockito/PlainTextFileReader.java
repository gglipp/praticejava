package xyz.zhangyi.practicejava.framework.mockito;

import java.util.ArrayList;
import java.util.List;

public class PlainTextFileReader implements TextFileReader {
    @Override
    public List<String> read(String fileName) {
        //read text file
        return new ArrayList<>();
    }

}
