package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory{

    public static ImageReader getImageReader(ImageTypes type){
        ImageReader reader = null;

        if(ImageTypes.BMP == type){
            return new BmpReader();
        } else if (ImageTypes.JPG == type) {
            return new JpgReader();
        } else if (ImageTypes.PNG == type) {
            return new PngReader();
        }else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
