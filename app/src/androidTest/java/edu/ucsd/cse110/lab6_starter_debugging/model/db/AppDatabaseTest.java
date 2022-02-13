package edu.ucsd.cse110.lab6_starter_debugging.model.db;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AppDatabaseTest extends TestCase {
    private AppDatabase db;

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        db = AppDatabase.useTestSingleton(context);
    }

    @Test
    public void testUseTestSingleton() {
        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");
        Note note1 = new Note(person1.getPersonId(), "Person 1 note");
        Note note2 = new Note(person2.getPersonId(), "Person 2 note");
        db.personsDao().insert(person1);
        db.personsDao().insert(person2);
        db.notesDao().insert(note1);
        db.notesDao().insert(note2);

        assertEquals(2, db.personsDao().getAll().size());
        assertEquals(2, db.personsDao().getAll().size());
    }
}