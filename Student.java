public class Student {
  private String firstname;
  private String lastname;

  public Student(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  // Overrides method in "super class"
  @Override
  public String toString() {
    return firstname + " " + lastname;
  } 
}