package lt.sdaacademy.designpatterns.structural.facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        destinationCodec = format.equals("mp4")
                ? new OggCompressionCodec()
                : new MPEG4CompressionCodec();

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = new AudioMixer().fix();

        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
