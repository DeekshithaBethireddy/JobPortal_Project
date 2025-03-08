package com.JobApplication.joblisting;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.JobApplication.joblisting.model.Post;
public interface PostRepository extends MongoRepository<Post,String>
{

}
