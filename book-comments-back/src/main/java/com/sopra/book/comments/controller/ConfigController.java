package com.sopra.book.comments.controller;

import com.sopra.book.comments.enums.CommentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/config")
public class ConfigController {

    // Récupération des types de commentaires
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/comments/types")
    public ResponseEntity<List<CommentType>> commentsTypes() {
        return ResponseEntity.ok().body(List.of(CommentType.values()));
    }
}
