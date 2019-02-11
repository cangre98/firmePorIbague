package co.com.registrovotante.demo.entidad;

import co.com.registrovotante.demo.entidad.enums.TipoUsuario;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@EqualsAndHashCode(of = "id", callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario", schema = "public")
@Builder
@XmlRootElement

public class Usuario implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombreUsuario;

    @Basic(optional = false)
    @Column(name = "tipo")
    @Enumerated(EnumType.ORDINAL)
    private TipoUsuario tipoUsuario;

    @Basic(optional = false)
    @Column(name = "usuario_estado")
    private boolean isEestado;

}

