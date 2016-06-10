package ba.mtel.parser;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableBatchProcessing
//@EnableAutoConfiguration
public class BatchConfiguration {
	
	/*

  @Autowired
  private JobBuilderFactory jobBuilderFactory;

  @Autowired
  private StepBuilderFactory stepBuilderFactory;
  
  @Bean
  public ItemReader reader() {
  	return new FlatFileItemReader();
  }

  @Bean
  public ItemProcessor processor() {
  	return new ItemProcessor();
  }

  @Bean
  public ItemWriter writer(DataSource dataSource) {
  	return new CustomItemItemWriter(dataSource);
  }

  @Bean
  public Step step1() {
    return stepBuilderFactory.get("step1")
        .tasklet(new Tasklet() {
          public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) {
            return null;
          }
        })
        .build();
  }

  @Bean
  public Job job(Step step1) throws Exception {
    return jobBuilderFactory.get("job1")
        .incrementer(new RunIdIncrementer())
        .start(step1)
        .build();
  }
  
  */
}
	