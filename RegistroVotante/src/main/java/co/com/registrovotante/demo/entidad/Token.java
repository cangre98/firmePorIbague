package co.com.registrovotante.demo.entidad;

import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(of = "id", callSuper = false)
@NoArgsConstructor
@Builder
@Table(name = "token", schema = "public")
@AllArgsConstructor
@XmlRootElement

public class Token implements Serializable {

    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "valor")
    private String valorToken;

    @JoinColumn(name = "usuario ", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuario;

}
