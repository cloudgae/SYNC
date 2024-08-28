package com.pro.sync.approval.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.pro.sync.approval.vo.ApprovalLineVo;
import com.pro.sync.approval.vo.ApprovalVo;
import com.pro.sync.employee.vo.EmployeeVo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ApprovalDaoImpl implements IApprovalDao{

	private final String NS = "com.pro.sync.approval.dao.ApprovalDaoImpl.";
	
	private final SqlSessionTemplate sessionTemplate;
	
	@Override
	public int requestApproval(ApprovalVo vo) {
		return sessionTemplate.insert(NS+"requestApproval", vo);
	}

	@Override
	public int insertApprovalLines(List<ApprovalLineVo> approvalLine) {
		return sessionTemplate.insert(NS+"insertApprovalLines", approvalLine);
	}

	@Override
	public int tempSaveApproval(ApprovalVo vo) {
		return sessionTemplate.insert(NS+"tempSaveApproval", vo);
	}

	@Override
	public List<ApprovalVo> getApprovalsList(String employeeId) {
		return sessionTemplate.selectList(NS+"getApprovalsList", employeeId);
	}

	@Override
	public ApprovalVo getApprovalDetail(Map<String, String> info) {
		return sessionTemplate.selectOne(NS+"getApprovalDetail", info);
	}

	@Override
	public int updateApprovalFlag(Map<String, String> flag) {
		return sessionTemplate.update(NS+"updateApprovalFlag", flag);
	}

	@Override
	public int modifyApproval(Map<String, String> info) {
		return sessionTemplate.update(NS+"modifyApproval", info);
	}

	@Override
	public List<ApprovalVo> getAllReceivedApproval(String employeeId) {
		return sessionTemplate.selectList(NS+"getAllReceivedApproval", employeeId);
	}



	
}
