package api.tistech.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_log", schema = "TISTECH")
public class LogModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_log")
	private Long id;

	@ApiModelProperty(notes = "User of the action", name = "Log User")
	@Column(name = "user_log")
	private String user;
	
	@ApiModelProperty(notes = "Log generated", name = "Log Text")
	@Column(name = "text_log")
	private String text;

	@ApiModelProperty(notes = "Created date of the log", name = "Log Timestamp")
	@Column(name = "created_date")
	private Timestamp timestamp;

}
