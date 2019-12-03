package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
    Job oneJob = new Job();
    Job jobTwo = new Job();
    assertFalse(oneJob == jobTwo);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job nameJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(nameJob.getEmployer() instanceof Employer);
        assertTrue(nameJob.getLocation() instanceof Location);
        assertTrue(nameJob.getPositionType() instanceof PositionType);
        assertTrue(nameJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(nameJob.getName(),"Product tester" );
        assertEquals(nameJob.getEmployer().toString(),"ACME");
        assertEquals(nameJob.getLocation().toString(),"Desert");
        assertEquals(nameJob.getPositionType().toString(),"Quality control");
        assertEquals(nameJob.getCoreCompetency().toString(),"Persistence");

    }
    @Test
    public void testJobsForEquality() {
        Job equalJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job falseJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(equalJob == falseJob);
    }

    @Test
    public void testJobBlankString() {
        Job blankJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(blankJob.toString().startsWith("\n"));
        assertTrue(blankJob.toString().endsWith("\n"));
    }
    @Test
    public void testNameEmpty() {
        Job blankJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String Id = "\nID: " + blankJob.getId();
        String name = "\nName: Data not available";
        String employer = "\nEmployer: " + blankJob.getEmployer().toString();
        String location = "\nLocation: " + blankJob.getLocation().toString();
        String positionType = "\nPosition Type: " + blankJob.getPositionType().toString();
        String coreCompetency = "\nCore Competency: " + blankJob.getCoreCompetency().toString();
        assertEquals(Id + name + employer + location + positionType + coreCompetency + "\n", blankJob.toString());
    }
    @Test
    public void testEmployerEmpty() {
        Job blankJob = new Job("name", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String Id = "\nID: " + blankJob.getId();
        String name = "\nName: " + blankJob.getName();;
        String employer = "\nEmployer: Data not available";
        String location = "\nLocation: " + blankJob.getLocation().toString();
        String positionType = "\nPosition Type: " + blankJob.getPositionType().toString();
        String coreCompetency = "\nCore Competency: " + blankJob.getCoreCompetency().toString();
        assertEquals(Id + name + employer + location + positionType + coreCompetency + "\n", blankJob.toString());
    }
    @Test
    public void testLocationEmpty() {
        Job blankJob = new Job("name", new Employer("employer"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String Id = "\nID: " + blankJob.getId();
        String name = "\nName: " + blankJob.getName();;
        String employer = "\nEmployer: " + blankJob.getEmployer().toString();
        String location = "\nLocation: Data not available";
        String positionType = "\nPosition Type: " + blankJob.getPositionType().toString();
        String coreCompetency = "\nCore Competency: " + blankJob.getCoreCompetency().toString();
        assertEquals(Id + name + employer + location + positionType + coreCompetency + "\n", blankJob.toString());
    }
    @Test
    public void testPositionTypeEmpty() {
        Job blankJob = new Job("name", new Employer("employer"), new Location("desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String Id = "\nID: " + blankJob.getId();
        String name = "\nName: " + blankJob.getName();;
        String employer = "\nEmployer: " + blankJob.getEmployer().toString();
        String location = "\nLocation: " + blankJob.getLocation().toString();
        String positionType = "\nPosition Type: Data not available";
        String coreCompetency = "\nCore Competency: " + blankJob.getCoreCompetency().toString();
        assertEquals(Id + name + employer + location + positionType + coreCompetency + "\n", blankJob.toString());
    }
    @Test
    public void testCoreCompetencyEmpty() {
        Job blankJob = new Job("name", new Employer("employer"), new Location("desert"), new PositionType("Quality control"), new CoreCompetency(""));
        String Id = "\nID: " + blankJob.getId();
        String name = "\nName: " + blankJob.getName();;
        String employer = "\nEmployer: " + blankJob.getEmployer().toString();
        String location = "\nLocation: " + blankJob.getLocation().toString();
        String positionType = "\nPosition Type: " + blankJob.getPositionType().toString();
        String coreCompetency = "\nCore Competency: Data not available";
        assertEquals(Id + name + employer + location + positionType + coreCompetency + "\n", blankJob.toString());
    }

    @Test
    public void testJobToString() {
        Job blankJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String Id = "\nID: " + blankJob.getId();
        String name = "\nName: " + blankJob.getName();
        String employer = "\nEmployer: " + blankJob.getEmployer().toString();
        String location = "\nLocation: " + blankJob.getLocation().toString();
        String positionType = "\nPosition Type: " + blankJob.getPositionType().toString();
        String coreCompetency = "\nCore Competency: " + blankJob.getCoreCompetency().toString();
        assertEquals(Id + name + employer + location + positionType + coreCompetency + "\n", blankJob.toString());
    }
}
