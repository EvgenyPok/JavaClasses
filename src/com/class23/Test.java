package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		emp.salary=90000;
		emp.getPaid();

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("---Creating Developer object---");
		Developer dev =new Developer();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object---");
		Tester qa =new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
	
		System.out.println("---Creating Bussiness Analyst object---");
		BusinessAnalyst ba =new BusinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		System.out.println("---Creating Automation Tester object---");
		AutomationTester at =new AutomationTester();
		at.salary=110000;
		at.getPaid();
		at.artifacts="Sprit backlog, Product Backlog";
		at.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.test();
		at.codeJava();
		
		System.out.println("---Creating Manual Tester object---");
		ManualTester mt =new ManualTester();
		mt.salary=80000;
		mt.getPaid();
		mt.artifacts="Sprit backlog, Product Backlog";
		mt.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.test();
		mt.testManually();
		
		System.out.println("---Creating FrontEndDeveloper object---");
		FrontEndDeveloper fenddev =new FrontEndDeveloper();
		fenddev.salary=120000;
		fenddev.getPaid();
		fenddev.artifacts="Sprit backlog";
		fenddev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		fenddev.workOnArtifacts();
		fenddev.attendScrumMeetings();
		fenddev.code();
		fenddev.codeHtml();
		
		System.out.println("---Creating BackEndDeveloper object---");
		BackEndDeveloper benddev =new BackEndDeveloper();
		benddev.salary=120000;
		benddev.getPaid();
		BackEndDeveloper.work();
		benddev.artifacts="Sprit backlog";
		benddev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		benddev.workOnArtifacts();
		benddev.attendScrumMeetings();
		benddev.code();
		benddev.codeSql();
	}
}
