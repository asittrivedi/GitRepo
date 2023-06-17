package hibernate2.hibernate2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
@Entity
public class student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		int sid;//P.K
		String sname;
		String DOB;
		String qualification;
		@ElementCollection
		@OrderColumn(name="col")
		String [] courses;
		@ElementCollection
		@OrderColumn(name="col1")
		List<String>emails;
		@ElementCollection
		@OrderColumn(name="col2")
		List<Integer> marks;
		@ElementCollection
		@OrderColumn(name="col3")
		Set<Long> phones;
		@ElementCollection
		@OrderColumn(name="col4")
		Map<String, Long>refs;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String[] getCourses() {
			return courses;
		}
		public void setCourses(String[] courses) {
			this.courses = courses;
		}
		public List<String> getEmails() {
			return emails;
		}
		public void setEmails(List<String> emails) {
			this.emails = emails;
		}
		public List<Integer> getMarks() {
			return marks;
		}
		public void setMarks(List<Integer> marks) {
			this.marks = marks;
		}
		public Set<Long> getPhones() {
			return phones;
		}
		public void setPhones(Set<Long> phones) {
			this.phones = phones;
		}
		public Map<String, Long> getRefs() {
			return refs;
		}
		public void setRefs(Map<String, Long> refs) {
			this.refs = refs;
		}
		public student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public student(int sid, String sname, String dOB, String qualification, String[] courses, List<String> emails,
				List<Integer> marks, Set<Long> phones, Map<String, Long> refs) {
			super();
			this.sid = sid;
			this.sname = sname;
			DOB = dOB;
			this.qualification = qualification;
			this.courses = courses;
			this.emails = emails;
			this.marks = marks;
			this.phones = phones;
			this.refs = refs;
		}
		@Override
		public String toString() {
			return "student [sid=" + sid + ", sname=" + sname + ", DOB=" + DOB + ", qualification=" + qualification
					+ ", courses=" + Arrays.toString(courses) + ", emails=" + emails + ", marks=" + marks + ", phones="
					+ phones + ", refs=" + refs + "]";
		}
		
}
