package allen.activiti.demo.first.service.impl;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import allen.activiti.demo.first.service.WorkFlow;

@Service
@Transactional
public class WorkFlowImpl implements WorkFlow {
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private HistoryService historyService;

	public void deploye() {
		DeploymentBuilder deploymentBuider = repositoryService
				.createDeployment();
		deploymentBuider.name("LeaveBPM")
		.addClasspathResource("diagrams/LeaveRequest.bpmn")
		.addClasspathResource("diagrams/LeaveRequest.png")
		.deploy();
	}

}
