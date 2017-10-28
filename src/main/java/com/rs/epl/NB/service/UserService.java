/**
 * 
 */
package com.rs.epl.NB.service;

//import java.io.ByteArrayOutputStream;
//import java.util.List;

import com.rs.epl.NB.dtoresponse.UserResponseDto;

/**
 * @author Nandhu
 *
 */
public interface UserService {
	UserResponseDto userLogin(String username, String password);

//	ByteArrayOutputStream convertPDFToByteArrayOutputStream(String filepath,String fileName)throws Exception;
	

//	List<RtoMasterResponseDto> getAllRtoMasterDetails(int pageId, int total);
	
}
