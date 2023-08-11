package com.db6n.service.service;

import com.db6n.service.repository.NoteRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteServiceTest {

    @Autowired
    private NoteService noteService;

    @MockBean
    private NoteRepository noteRepository;

}
