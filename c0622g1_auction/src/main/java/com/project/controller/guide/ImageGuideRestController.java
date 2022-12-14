package com.project.controller.guide;

import com.project.model.guide.ImgUrlGuide;
import com.project.service.guide.IImgUrlGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("auction/api/guide/image")
@CrossOrigin("*")
public class ImageGuideRestController {

    @Autowired
    private IImgUrlGuideService imgUrlGuideService;

    /**
     * Create by: SonPT,
     * Date created: 13/12/2022
     * Function: find all image url by id of guide
     * @Param: id of guide
     * @return list of image url and status code
     */

    @GetMapping("/{id}")
    public ResponseEntity<List<ImgUrlGuide>> findImgGuideById(@PathVariable int id) {
        List<ImgUrlGuide> listImg = imgUrlGuideService.findImgByGuideId(id);
        if (listImg.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(listImg, HttpStatus.OK);
    }
}
