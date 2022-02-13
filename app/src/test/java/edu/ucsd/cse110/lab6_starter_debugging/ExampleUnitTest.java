package edu.ucsd.cse110.lab6_starter_debugging;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import android.content.Context;

import edu.ucsd.cse110.lab6_starter_debugging.model.db.AppDatabase;
import edu.ucsd.cse110.lab6_starter_debugging.model.db.NotesDao;
import edu.ucsd.cse110.lab6_starter_debugging.model.db.PersonDao;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}