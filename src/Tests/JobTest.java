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
    public void testBlankToString() {
        Job blankJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(blankJob.toString(), "\n\n");
    }
}
