/**
 * 
 */
package com.training.springboot.jpa.jpademo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.jpa.jpademo.exception.ResourceNotFoundException;
import com.training.springboot.jpa.jpademo.model.Note;
import com.training.springboot.jpa.jpademo.service.INoteService;

/**
 * @author admi
 *
 */
@RestController
@RequestMapping("/api")
public class NoteController {
	@Autowired
	INoteService noteService;
	
	//Get ALL Notes
	@GetMapping("/allnotes")
	//@RequestMapping(value="/notes",method=RequestMethod.GET)
	public List<Note> getAllNotes(){
		return noteService.getAllNotes();
	}
	//Create  a new Note
	@PostMapping("/notes")
	public Note createNote(@RequestBody Note note) {
		return noteService.createNote(note);
	}
	
	/**
	//Get a Single Note
	@GetMapping("notes/{id}")
	//@RequestMapping(value="/notes/{id}",method=RequestMethod.GET)
	public Optional<Note> getNoteById(@PathVariable(value="id") Long noteId) {
	//public Optional<Note> getNoteById(@RequestParam(value="id")Long noteId){
		Optional<Note> note = noteService.getNoteById(noteId);
		if(note == null) {
			throw new ResourceNotFoundException("Note", "id", noteId);
		}else {
			return note;
		}
	}
	//Update a Note
	@PutMapping("notes/{id}")
	public Optional<Note> updateNote(@PathVariable(value="id") Long noteId,@RequestBody Note noteDetails) {
		return noteService.updateNote(noteId, noteDetails);
	}
	//Delete a Note
	@DeleteMapping("notes/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value="id") Long noteId) {
		return noteService.deleteNote(noteId);
	}
	**/
}
