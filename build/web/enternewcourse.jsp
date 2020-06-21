<%-- 
    Document   : enternewcourse.jsp
    Created on : 29 Oct, 2015, 5:57:43 PM
    Author     : Tarequzzaman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter info</title>
        <style>
            .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .into{
                margin-top: 150px;
                text-align: center;
                color: brown;

            } 

            .dropdown{
                 padding: 6px 119px;
            }
        </style>
        <script>
            function myfunction(){
                var   xx = document.getElementById("x").value;
              
                var len = xx.length;
                var i ,x ,cou=0;
                var num=0;
                var cha=0;
                var spa=0;
                for(i=0;i<len;i++)
                {
                    x =  xx.charCodeAt(i)   
                    if(x>=65 && x<=90 && num==0 && spa==0)
                    {
                      
                    }
                    else if(x==45)
                    {   
                        cha =1;
                        spa=1;
                    }
                    else if(x>=48 && x<=57 &&  spa==1 && cha==1)
                    {
                        num=1;  
                    }
                    
                    else{
                        document.getElementById("a").innerHTML="Wrong formet!!! Example: CSE-501";
                        cou=1;
                    }
                }
                var y= document.getElementById("select").value;
               
                
                 var count=0;
               if(y=="3")
                   {
                        document.getElementById("b").innerHTML="Select Lab or Theory course";
                        count=1;
                   }
                      
                if(cou==1 || count == 1)
                {
                    return false;
                }
                else{
                    return true;
                }
                
            }
        </script>

    </head>
    <body>
        <div class="header">
            <h1>Welcome to result Processing System</h1>
        </div>
        <div class="main">
            <div class="into">
                <h2>Enter New Course</h2>
            </div>
            <div class="data">
                <center>
                    <form action="enter_course_into_db.jsp"  onsubmit="return myfunction()">
                        <table>
                            <tr>
                                <td>

                                    <input type="text" name="course_id" id="x" placeholder="Course ID" style="width: 300px;height: 25px" required>
                                    <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="a" style="color: red;"> </span>
                                    </div>
                                </td>               
                            </tr>
                            <tr>
                                <td>

                                    <input type="text" name="course_title" placeholder="Course Title" style="width: 300px;height: 25px" required>
                                </td>
                            </tr>
                            
                            <tr>
                                <td> 
                                 
                                        <select name="course_type" class="dropdown" id ="select">
                                            <option value="3" selected>Select</option>
                                            <option value="Theory">Theory</option>
                                            <option value="Lab">Lab</option>
                                        </select>
                                     <span style="color:red;list-style:none;font-size:12px;font-weight:bold;"></span><br>
                                    <div>
                                        <span id ="b" style="color: red;"> </span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="text" name="credit" placeholder="Credit" style="width: 300px;height: 25px" required>
                                </td>
                            </tr>
                            
                        </table>
                        <div class="entering">
                            <center> 
                                <input type="submit" value="Submit" style="padding: 3px; margin-top: 7px;">
                            </center>
                        </div>

                    </form>
                </center>
            </div>

        </div>
        <div class="footer">

        </div>
    </body>
</html>
