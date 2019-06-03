package com.stackroute.springMuzix.db;

import com.stackroute.springMuzix.dao.TrackDAO;
import com.stackroute.springMuzix.entity.Track;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = TrackDAO.class)
@Configuration
public class trackdb {

    @Bean
    CommandLineRunner commandLineRunner(TrackDAO trackDAO) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                trackDAO.save(new Track("aBCd","nice song"));
                trackDAO.save(new Track("Kolaveri","super song"));
            }
        };
    }

}
