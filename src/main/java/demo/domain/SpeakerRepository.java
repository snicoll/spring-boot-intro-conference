package demo.domain;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface SpeakerRepository extends CrudRepository<Speaker, Long> {

	@RestResource(path = "by-twitter")
	Speaker findByTwitter(@Param("id") String twitter);

	@RestResource(path = "by-github")
	Speaker findByGithub(@Param("id") String github);

	Collection<Speaker> findByLastName(@Param("name") String lastName);

}
