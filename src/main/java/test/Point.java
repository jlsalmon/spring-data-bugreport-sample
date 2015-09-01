package test;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Justin Lewis Salmon
 */
@Data
@Document
public class Point {

  @Id
  private String id;
  private String name;
}
