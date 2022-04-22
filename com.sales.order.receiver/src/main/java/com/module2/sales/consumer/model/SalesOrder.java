package com.module2.sales.consumer.model;



import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Document(collection="order")
public class SalesOrder {
	
	private Long id;
	private String salesorder;

}
