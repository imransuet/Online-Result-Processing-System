<%-- 
    Document   : termtest
    Created on : 22 Dec, 2015, 12:16:58 AM
    Author     : Tarequzzaman
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         .header{
                background-color: #5EFB6E; 
                text-align: center;
                padding: 30px;
            }
            .mainmanu{
                text-align: center;
                align: center;
            }
            .main1{
                margin-top: 100px;
                 width: 300px;
                 height: 400px;
                overflow:hidden; 
               
            }
            .main1 ul{
             
               margin: 0;
               padding:0;
                list-style:none;
            }
            .main1 ul li{
                
                float:none;
                border:2px solid #ddd;
            }
            .main1 ul li a{
                text-decoration: none;
                color:#000;
                display: block;
                padding: 10px 20px;
            }
            .main1 ul li a:hover{
                background-color: darkorange;
            }
        </style>
         <link href="css/text.css" rel=" stylesheet" type="text/css" media="print">
    </head>
     <body>
        <div class ="main">
            <div class="header">

                <h1>Welcome to result Processing System</h1>
            </div>
            <div class="mainmanu">
                <center>
                <div class="main1">                    
                 <ul>
                        <li><a href="enter_session_semester_for_termtest.jsp">Enter New Term Test</a></li>
                        <li><a href="update_semester_session_for_termtest.jsp">Update Term Test</a></li>
                        <li><a href="view_session_semester_for_termtest.jsp">View Term Test</a></li>
                        <li><a href="delete_session_semester_for_termtest.jsp">Delete Term Test</a></li>
                    </ul> 
                </div>
                    </center>

            </div>
            <div class="footer">


            </div>
        </div>

    </body>
</html>

