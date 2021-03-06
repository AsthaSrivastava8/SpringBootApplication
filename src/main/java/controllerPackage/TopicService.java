package controllerPackage;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//
//			new Topic("spring", "Spring Framework", "Spring Description"),
//			new Topic("angular", "Angular Framework", "Angular Description"),
//			new Topic("java", "Java Framework", "Java Description")));

	public List<Topic> getAllTopics() {
		// return topics;

		List<Topic> allTopics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(allTopics::add);
		return allTopics;
	}

	public Optional<Topic> getTopic(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		// topics.add(topic);

		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {

		// for (int i = 0; i < topics.size(); i++) {
		// Topic t = topics.get(i);
		// if (t.getId().equals(id)) {
		// topics.set(i, topic);
		// return;
		// }
		// }

		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}
}
