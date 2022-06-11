package hw11Abstraction;

/*Now create a class TestInstitute. Then Instantiate  ColumbiaUniversity , University and MedicalSchool
 *one by one. Call all the possible methods from the object of ColumbiaUniversity , University and 
 *MedicalSchool. Make sure you execute the static methods from ColumbiaUniversity , University and 
 *MedicalSchool (if not created, please create one). Try to create default method (public default 
 *void ...........[follow the format of default method from interface]) in regular class and abstract 
 *class if possible and execute them if possible. 
 */
public class TestInstitute {
	public static void main(String[] args) {
		
		System.out.println("\n----------Regular class ColumbiaUniversity----------");
		ColumbiaUniversity columbiaUni= new ColumbiaUniversity();
		columbiaUni.chemistry();
		ColumbiaUniversity.columbiaUniversity();
		ColumbiaUniversity.medicalSchool();
		columbiaUni.biochemistryLab();
		columbiaUni.hygiene();
		columbiaUni.caring();
		columbiaUni.maths();
		columbiaUni.commonRoom();
		columbiaUni.laboratory();
		columbiaUni.languageClub();
		columbiaUni.emergencyRoom();
		columbiaUni.surgeryRoom();
		columbiaUni.cafeteria();
		columbiaUni.morgue();
		columbiaUni.lawInfo();
		columbiaUni.classSize();
		columbiaUni.playGround();
		columbiaUni.teacher();
		columbiaUni.gymnasium();
		columbiaUni.dorm();
		columbiaUni.aeronauticalInfo();
		columbiaUni.vocationalInfo();
		columbiaUni.computerLab();
		
		System.out.println("\n----------Interface University----------");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.dorm();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		
		
		System.out.println("\n----------Abstract class MedicalSchool----------");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		MedicalSchool.medicalSchool();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.mechanicalLab();
		medicalSchool.anthropology();
		medicalSchool.lawInfo();
		
	}
}
