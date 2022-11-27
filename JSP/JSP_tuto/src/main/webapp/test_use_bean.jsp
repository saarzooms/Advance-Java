<jsp:useBean id="stu" class="testpackage.Student" scope="session"/>

<jsp:setProperty property="*" name="stu" />


<jsp:getProperty property="id" name="stu"/><br/>
<jsp:getProperty property="rollNo" name="stu"/><br/>
<jsp:getProperty property="branch" name="stu"/><br/>
<jsp:getProperty property="name" name="stu"/><br/>