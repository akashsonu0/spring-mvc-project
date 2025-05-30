package in.pwskills.akash.bean;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 
     */
    @Serial
    private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userName;
	private String userRole;

}