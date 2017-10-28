/**
 * 
 */
package com.rs.epl.NB.serviceimpl;

//import java.io.ByteArrayOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.MalformedURLException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

//import com.firstapex.rs.epl.cn.dto.request.SaveUserInformation;
//import com.firstapex.rs.epl.cn.dto.response.MfrResponseDto;
//import com.firstapex.rs.epl.cn.dto.response.UserResponseDto;
//import com.firstapex.rs.epl.cn.entity.Users;
//import com.firstapex.rs.epl.cn.repository.UsersRepository;
//import com.firstapex.rs.epl.cn.service.UserService;
//import com.itextpdf.text.BadElementException;
//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.PageSize;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.pdf.ColumnText;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfPageEventHelper;
//import com.itextpdf.text.pdf.PdfWriter;
import com.rs.epl.NB.dtoresponse.UserResponseDto;
import com.rs.epl.NB.oementity.User;
import com.rs.epl.NB.policyrepository.UsersRepository;
import com.rs.epl.NB.service.UserService;

/**
 * @author System7
 *
 */
@Service
//@Transactional("transactionManager")
public class UserServiceImpl implements UserService {

	@Resource
	UsersRepository usersRepository;
	
	
	
	
//	@Resource
//	RsFirstGenRepository rsFirstGenRepository;


	// @Resource
	// RtoMasterRepository rtoMasterRepository;

	/**
	 * User Try To Login
	 */
	@Override
//	@Transactional(value="eplTransactionManager")
	public UserResponseDto userLogin(String username, String password) {
		UserResponseDto usersResponseDto = new UserResponseDto();

		User user = usersRepository.findByUsernameAndPassword(username, password);

		if (user != null) {
			usersResponseDto.setMessage("success");
			usersResponseDto.setUsername(user.getUsername());
		} else {
			usersResponseDto.setMessage("failure");
		}
		return usersResponseDto;
	}

	/**
	 * Registraion on Users Information Saving
	 * 
	 */
/*	public UserResponseDto saveUser(SaveUserInformation saveUserInformation) {
		
		UserResponseDto userResponseDto = new UserResponseDto();

		
//		UserRoles userRoles=userRo
		Users saveUser = new Users();
		saveUser.setUsername(saveUserInformation.getUserName());
		saveUser.setPassword(saveUserInformation.getPassword());
		saveUser.setCreatedBy("0");
		saveUser.setCreatedDate(new Date());
		saveUser.setModifiedBy("0");
		saveUser.setModifiedDate(new Date());
		usersRepository.save(saveUser);
		// if (saveUser != null) {
		userResponseDto.setMessage("success");
		// } else {
		// userResponseDto.setMessage("failure");
		// }

		return userResponseDto;*/
	}
