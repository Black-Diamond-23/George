package PatientManagement.Counfigure;

import javax.tools.DocumentationTool.Location;

import PatientManagement.Catalogs.AgeGroup;
import PatientManagement.Catalogs.VitalSignLimits;
import PatientManagement.Catalogs.VitalSignsCatalog;
import PatientManagement.Clinic.Clinic;
import PatientManagement.Clinic.LocationList;
import PatientManagement.Clinic.PatientDirectory;
import PatientManagement.Clinic.Site;
import PatientManagement.Clinic.SiteCatalog;
import PatientManagement.Patient.Patient;
import PatientManagement.Persona.Person;
import PatientManagement.Persona.PersonDirectory;

public class ConfigurePM {
    public ConfigurePM(int numClincs, int numPatients){
        
    }

    public void configure(){
        // Configure everything.
        configureClinics();
        configurePatients();
        configureEPatient();
    }

    private void configureClinics(){
        // Create clinics and give locations and sites
        Clinic clinic = new Clinic("Kal's Clinic");
        LocationList locations = clinic.getLocationList();
        PatientManagement.Clinic.Location seattle  = locations.newLocation("Seattle area");
        
        SiteCatalog siteCatalog = clinic.getSiteCatalog();
        Site CapitalHillCenter = siteCatalog.newSite(seattle);
        // Can add more sites to the clinic.

        // configureVitalSigns();
        VitalSignsCatalog vsc = clinic.getVitalSignsCatalog();
        AgeGroup adults_21_50 = vsc.newAgeGroup("Adults 21-50", 50, 21);
        VitalSignLimits heartRateLimits = vsc.newVitalSignLimits("HR");
        VitalSignLimits bloodPressureLimits = vsc.newVitalSignLimits("BP");
        VitalSignLimits bloodLipids = vsc.newVitalSignLimits("BL");

        heartRateLimits.addLimits(adults_21_50, 105, 55);
        bloodPressureLimits.addLimits(adults_21_50, 140, 70);
        bloodLipids.addLimits(adults_21_50, 150, 100);

        AgeGroup adults_51_90 = vsc.newAgeGroup("Adults 51-90", 90, 51);
        heartRateLimits.addLimits(adults_51_90, 95, 40);
        bloodPressureLimits.addLimits(adults_51_90, 120, 80);
        bloodLipids.addLimits(adults_51_90, 200, 150);











        


        


        

    }

    private void configurePatients(){
        Clinic clinic = new Clinic("Kal's Clinic");
        PersonDirectory pd = clinic.getPersonDirectory();
        Person firstPerson = pd.newPerson("George", 18);
        PatientDirectory patientDirectory = clinic.getPatientDirectory();
        Patient archil = patientDirectory.newPatient(firstPerson);



    }

    private void configureEPatient(){}
}