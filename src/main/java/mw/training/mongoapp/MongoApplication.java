package mw.training.mongoapp;

import mw.training.mongoapp.model.Address;
import mw.training.mongoapp.model.Gender;
import mw.training.mongoapp.model.Student;
import mw.training.mongoapp.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
		return args -> {
			Address address = new Address(
					"Poland",
					"Gdansk",
					"80-888");

			Student student = new Student(
					"Mikolaj3",
					"Witkowski3",
					"mik3@gmail.com",
					Gender.MALE, address,
					List.of("Computer Science", "Geography", "History"),
					BigDecimal.ZERO,
					LocalDateTime.now()
			);

//			repository.insert(student);

//			Query query = new Query();
//			query.addCriteria(Criteria.where("email").is(student.getEmail()));
//
//			List<Student> students = mongoTemplate.find(query, Student.class);
//			System.out.println("----> " + students.size());


			repository.findStudentByEmail(student.getEmail())
					.ifPresentOrElse(s -> {
						System.out.println("--> email exists");
					}, () -> {
						System.out.println("Inserting student... " + student);
					});
		};
	}


}
