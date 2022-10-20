package dev.riv.trms.models_dtos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "empMessages")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empMessage")
public class EmpMessage {

//    todo implement many-to-many between this and Employees

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empMessageId")
    private int empMessageId;

    @Column(name = "empEmailSender")
    private String empEmailSender;

    @Column(name = "empEmailReceiver")
    private String empEmailReceiver;

    @Column(name = "messageContent")
    private String messageContent;
}
