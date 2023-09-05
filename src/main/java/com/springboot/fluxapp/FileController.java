package com.springboot.fluxapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@RestController
@RequestMapping("/files")
public class FileController {

    @PostMapping("/upload")
    public ResponseEntity<Void> uploadFile(@RequestParam("file") MultipartFile file){
        String fileName = file.getOriginalFilename();
        File directory = new File("/filestorage/");
        if(!directory.exists()){
            directory.mkdir();
        }
        try{
            file.transferTo(Path.of(directory + fileName));
            return new ResponseEntity<>(HttpStatus.CREATED);

        }catch (IOException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
