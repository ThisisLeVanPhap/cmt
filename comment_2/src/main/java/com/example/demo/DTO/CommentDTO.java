package com.example.demo.DTO;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {
	private Long bookID;
	private String comment;
	private Long commentID;
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime lastUpdate;
	private String pathPicture;
	private int userID;
	private String username;
}