package edu.yavirac.clientebackend.entity;
import org.springframework.data.annotation.Id;  
import org.springframework.data.relational.core.mapping.Column;  
import org.springframework.data.relational.core.mapping.Table;   

import lombok.Data;  

@Data  
@Table("public\".\"clientes") //nombre del esquema y tabla

public class Cliente {
    @Column("cliente_id")  
    @Id
    private long clienteId;  
    private String nombre; 
    private String identificacion;
}
