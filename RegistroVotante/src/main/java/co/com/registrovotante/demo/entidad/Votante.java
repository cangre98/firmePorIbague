package co.com.registrovotante.demo.entidad;

import co.com.registrovotante.demo.entidad.enums.TipoDocumento;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@EqualsAndHashCode(of = "id", callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "votante",schema = "public")
@Builder
@XmlRootElement
public class Votante implements Serializable {

    private static final long serializableUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombreVotante;

    @Basic(optional = false)
    @Column(name = "apellido")
    private String votanteApellido;

    @Basic(optional = false)
    @Column(name = "tipo_documuento")
    @Enumerated(EnumType.ORDINAL)
    private TipoDocumento tipoDocumuento;

    @Basic(optional = false)
    @Column(name = "numero_documento")
    private int numeroDocumento;

    @Basic(optional = false)
    @Column(name = "celular")
    private int votanteCelular;

    @Basic(optional = false)
    @Column(name = "email")
    private String votanteEmail;

    @Basic(optional = false)
    @Column(name = "direccion")
    private String votanteDireccion;

    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM--yyyy")
    private Data votanteFecha;

    @Basic(optional = false)
    @Column(name = "estado")
    private boolean isEstado;

    @JoinColumn(name = "usuario", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuario;


}
