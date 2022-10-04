<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_QC 70,000.00     MC 7.00               _355b28_1_2</name>
   <tag></tag>
   <elementGuidId>818f2b14-be90-4189-84bf-d4b910782667</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//header[@id='header']/nav/div/div/div[2]/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.user-menu-section</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>85c3ffa3-9ee9-4e3b-95f9-23b86052c525</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>user-menu-section</value>
      <webElementGuid>861ed9f9-d7e8-4424-9230-cbb77364f47a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> 
         QC 70,000.00     MC 7.00 
         
         Buy 
         
         
          
           Buy 
           
           
           



    
    
      
        
        
      
      
        
      
    
  
  
    function readNotification(event, messageId) {
      event.preventDefault();
      if (jQuery(event.target).hasClass('unread')) {
        jQuery.post('/account/readNotification', 'messageId=' + messageId)
          .done(function (response) {
            jQuery(event.target).removeClass('unread');
            // document.querySelectorAll('#notifications-dropdown .badge').forEach(e => e.innerText = e.innerText - 1);

            document.querySelectorAll('#notifications-dropdown .badge').forEach(function (e) {
              e.innerText = e.innerText - 1;
              if (e.innerText === &quot;0&quot;) {
                e.style.display = 'none';
              }
            });

            jQuery('.dropdown-footer a').remove();
          }).fail(function (error) {
            console.log(&quot;error: &quot; + error)
          });
      }
    }

    function readAllNotification(event, messageIds) {
      event.preventDefault();
      if (messageIds === &quot;&quot;) {
        return;
      }
      jQuery.post('/account/readAllNotification', 'messageIds=' + messageIds)
        .done(function (response) {
          jQuery('.notifications-list li a').removeClass('unread');
          // document.querySelectorAll('#notifications-dropdown .badge').hide();
          document.querySelectorAll('#notifications-dropdown .badge').forEach(e => e.style.display = 'none');
        }).fail(function (error) {
          console.log(&quot;error: &quot; + error)
        });
    }

    jQuery('document').ready(function ($) {
      updateNotificationInfo();

      function updateNotificationInfo() {
        if (isLoggedIn()) {
          $('.notifications-list li').remove();
          $.get('/account/getNotifications')
            .done(function (response) {
              const unreadCounterWrapper = $('#notifications-dropdown .fa-bell');
              unreadCounterWrapper.append(addUnreadCounterElement(response.unreadTotal));

              const notificationMessages = response.notifications;
              const table = $('.notifications-list');
              let notificationsIds = &quot;&quot;;
              for (let i in notificationMessages) {
                table.append(buildNotificationRow(notificationMessages[i]));
                notificationsIds += notificationMessages[i].id + &quot;,&quot;;
              }
              $('.dropdown-footer a').remove();
              if (notificationsIds !== &quot;&quot;) {
                $('.dropdown-footer').append(buildMarkAllButton(notificationsIds));
              }
            }).fail(function (error) {
              console.log('error: ' + error);
            });
        }
      }

      function addUnreadCounterElement(counter) {
        if (counter > 0) {
          return &quot;&quot; +
            &quot; &lt;span class='badge'>&quot; + counter + &quot;&lt;/span>&quot;;
        }
      }

      function buildMarkAllButton(notificationsIds) {
        const idsAsParameter = &quot;'&quot; + notificationsIds + &quot;'&quot;;
        return &quot;&quot; +
          &quot;&lt;a href=''&quot; +
          ' onclick=&quot;readAllNotification(event,' + idsAsParameter + ')&quot;>' +
          'Mark all as read' + &quot;&lt;/a>&quot;;
      }

      function buildNotificationRow(row) {
        return &quot;&quot; +
          &quot;&lt;li>&quot; +
          &quot;&lt;a href=''&quot; +
          ' onclick=&quot;readNotification(event,' + row.id + ')&quot;' +
          (row.unread ? &quot; class='unread'&quot; : &quot; &quot;) +
          row.message + &quot;&lt;/a>&quot; +
          &quot;&lt;/li>&quot;
      }
    });
  


 
                
             
             Dashboard  
             Transactions  
             History  
             Settings  
             Log Out 
             
            
           
          
          Online players: 3143 
          
         
       </value>
      <webElementGuid>7726fff0-7b43-4836-a4fc-b747dc4b66ae</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;header&quot;)/nav[@class=&quot;navbar fixed&quot;]/div[@class=&quot;header-top&quot;]/div[@class=&quot;container&quot;]/div[@class=&quot;user-menu-section-wrapper&quot;]/div[@class=&quot;user-menu-section&quot;]</value>
      <webElementGuid>f565cddd-3bf9-440e-8107-6e5b05a3db52</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//header[@id='header']/nav/div/div/div[2]/div</value>
      <webElementGuid>ac9402ae-83f1-4add-9ace-dc0ebdf0432a</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[2]/div</value>
      <webElementGuid>e497eab4-72ed-4b4c-bf44-c592af2df859</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot; 
         QC 70,000.00     MC 7.00 
         
         Buy 
         
         
          
           Buy 
           
           
           



    
    
      
        
        
      
      
        
      
    
  
  
    function readNotification(event, messageId) {
      event.preventDefault();
      if (jQuery(event.target).hasClass(&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;)) {
        jQuery.post(&quot; , &quot;'&quot; , &quot;/account/readNotification&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;messageId=&quot; , &quot;'&quot; , &quot; + messageId)
          .done(function (response) {
            jQuery(event.target).removeClass(&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;);
            // document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).forEach(e => e.innerText = e.innerText - 1);

            document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).forEach(function (e) {
              e.innerText = e.innerText - 1;
              if (e.innerText === &quot;0&quot;) {
                e.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
              }
            });

            jQuery(&quot; , &quot;'&quot; , &quot;.dropdown-footer a&quot; , &quot;'&quot; , &quot;).remove();
          }).fail(function (error) {
            console.log(&quot;error: &quot; + error)
          });
      }
    }

    function readAllNotification(event, messageIds) {
      event.preventDefault();
      if (messageIds === &quot;&quot;) {
        return;
      }
      jQuery.post(&quot; , &quot;'&quot; , &quot;/account/readAllNotification&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;messageIds=&quot; , &quot;'&quot; , &quot; + messageIds)
        .done(function (response) {
          jQuery(&quot; , &quot;'&quot; , &quot;.notifications-list li a&quot; , &quot;'&quot; , &quot;).removeClass(&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;);
          // document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).hide();
          document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).forEach(e => e.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;);
        }).fail(function (error) {
          console.log(&quot;error: &quot; + error)
        });
    }

    jQuery(&quot; , &quot;'&quot; , &quot;document&quot; , &quot;'&quot; , &quot;).ready(function ($) {
      updateNotificationInfo();

      function updateNotificationInfo() {
        if (isLoggedIn()) {
          $(&quot; , &quot;'&quot; , &quot;.notifications-list li&quot; , &quot;'&quot; , &quot;).remove();
          $.get(&quot; , &quot;'&quot; , &quot;/account/getNotifications&quot; , &quot;'&quot; , &quot;)
            .done(function (response) {
              const unreadCounterWrapper = $(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .fa-bell&quot; , &quot;'&quot; , &quot;);
              unreadCounterWrapper.append(addUnreadCounterElement(response.unreadTotal));

              const notificationMessages = response.notifications;
              const table = $(&quot; , &quot;'&quot; , &quot;.notifications-list&quot; , &quot;'&quot; , &quot;);
              let notificationsIds = &quot;&quot;;
              for (let i in notificationMessages) {
                table.append(buildNotificationRow(notificationMessages[i]));
                notificationsIds += notificationMessages[i].id + &quot;,&quot;;
              }
              $(&quot; , &quot;'&quot; , &quot;.dropdown-footer a&quot; , &quot;'&quot; , &quot;).remove();
              if (notificationsIds !== &quot;&quot;) {
                $(&quot; , &quot;'&quot; , &quot;.dropdown-footer&quot; , &quot;'&quot; , &quot;).append(buildMarkAllButton(notificationsIds));
              }
            }).fail(function (error) {
              console.log(&quot; , &quot;'&quot; , &quot;error: &quot; , &quot;'&quot; , &quot; + error);
            });
        }
      }

      function addUnreadCounterElement(counter) {
        if (counter > 0) {
          return &quot;&quot; +
            &quot; &lt;span class=&quot; , &quot;'&quot; , &quot;badge&quot; , &quot;'&quot; , &quot;>&quot; + counter + &quot;&lt;/span>&quot;;
        }
      }

      function buildMarkAllButton(notificationsIds) {
        const idsAsParameter = &quot;&quot; , &quot;'&quot; , &quot;&quot; + notificationsIds + &quot;&quot; , &quot;'&quot; , &quot;&quot;;
        return &quot;&quot; +
          &quot;&lt;a href=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;&quot; +
          &quot; , &quot;'&quot; , &quot; onclick=&quot;readAllNotification(event,&quot; , &quot;'&quot; , &quot; + idsAsParameter + &quot; , &quot;'&quot; , &quot;)&quot;>&quot; , &quot;'&quot; , &quot; +
          &quot; , &quot;'&quot; , &quot;Mark all as read&quot; , &quot;'&quot; , &quot; + &quot;&lt;/a>&quot;;
      }

      function buildNotificationRow(row) {
        return &quot;&quot; +
          &quot;&lt;li>&quot; +
          &quot;&lt;a href=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;&quot; +
          &quot; , &quot;'&quot; , &quot; onclick=&quot;readNotification(event,&quot; , &quot;'&quot; , &quot; + row.id + &quot; , &quot;'&quot; , &quot;)&quot;&quot; , &quot;'&quot; , &quot; +
          (row.unread ? &quot; class=&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;&quot; : &quot; &quot;) +
          row.message + &quot;&lt;/a>&quot; +
          &quot;&lt;/li>&quot;
      }
    });
  


 
                
             
             Dashboard  
             Transactions  
             History  
             Settings  
             Log Out 
             
            
           
          
          Online players: 3143 
          
         
       &quot;) or . = concat(&quot; 
         QC 70,000.00     MC 7.00 
         
         Buy 
         
         
          
           Buy 
           
           
           



    
    
      
        
        
      
      
        
      
    
  
  
    function readNotification(event, messageId) {
      event.preventDefault();
      if (jQuery(event.target).hasClass(&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;)) {
        jQuery.post(&quot; , &quot;'&quot; , &quot;/account/readNotification&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;messageId=&quot; , &quot;'&quot; , &quot; + messageId)
          .done(function (response) {
            jQuery(event.target).removeClass(&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;);
            // document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).forEach(e => e.innerText = e.innerText - 1);

            document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).forEach(function (e) {
              e.innerText = e.innerText - 1;
              if (e.innerText === &quot;0&quot;) {
                e.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
              }
            });

            jQuery(&quot; , &quot;'&quot; , &quot;.dropdown-footer a&quot; , &quot;'&quot; , &quot;).remove();
          }).fail(function (error) {
            console.log(&quot;error: &quot; + error)
          });
      }
    }

    function readAllNotification(event, messageIds) {
      event.preventDefault();
      if (messageIds === &quot;&quot;) {
        return;
      }
      jQuery.post(&quot; , &quot;'&quot; , &quot;/account/readAllNotification&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;messageIds=&quot; , &quot;'&quot; , &quot; + messageIds)
        .done(function (response) {
          jQuery(&quot; , &quot;'&quot; , &quot;.notifications-list li a&quot; , &quot;'&quot; , &quot;).removeClass(&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;);
          // document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).hide();
          document.querySelectorAll(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .badge&quot; , &quot;'&quot; , &quot;).forEach(e => e.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;);
        }).fail(function (error) {
          console.log(&quot;error: &quot; + error)
        });
    }

    jQuery(&quot; , &quot;'&quot; , &quot;document&quot; , &quot;'&quot; , &quot;).ready(function ($) {
      updateNotificationInfo();

      function updateNotificationInfo() {
        if (isLoggedIn()) {
          $(&quot; , &quot;'&quot; , &quot;.notifications-list li&quot; , &quot;'&quot; , &quot;).remove();
          $.get(&quot; , &quot;'&quot; , &quot;/account/getNotifications&quot; , &quot;'&quot; , &quot;)
            .done(function (response) {
              const unreadCounterWrapper = $(&quot; , &quot;'&quot; , &quot;#notifications-dropdown .fa-bell&quot; , &quot;'&quot; , &quot;);
              unreadCounterWrapper.append(addUnreadCounterElement(response.unreadTotal));

              const notificationMessages = response.notifications;
              const table = $(&quot; , &quot;'&quot; , &quot;.notifications-list&quot; , &quot;'&quot; , &quot;);
              let notificationsIds = &quot;&quot;;
              for (let i in notificationMessages) {
                table.append(buildNotificationRow(notificationMessages[i]));
                notificationsIds += notificationMessages[i].id + &quot;,&quot;;
              }
              $(&quot; , &quot;'&quot; , &quot;.dropdown-footer a&quot; , &quot;'&quot; , &quot;).remove();
              if (notificationsIds !== &quot;&quot;) {
                $(&quot; , &quot;'&quot; , &quot;.dropdown-footer&quot; , &quot;'&quot; , &quot;).append(buildMarkAllButton(notificationsIds));
              }
            }).fail(function (error) {
              console.log(&quot; , &quot;'&quot; , &quot;error: &quot; , &quot;'&quot; , &quot; + error);
            });
        }
      }

      function addUnreadCounterElement(counter) {
        if (counter > 0) {
          return &quot;&quot; +
            &quot; &lt;span class=&quot; , &quot;'&quot; , &quot;badge&quot; , &quot;'&quot; , &quot;>&quot; + counter + &quot;&lt;/span>&quot;;
        }
      }

      function buildMarkAllButton(notificationsIds) {
        const idsAsParameter = &quot;&quot; , &quot;'&quot; , &quot;&quot; + notificationsIds + &quot;&quot; , &quot;'&quot; , &quot;&quot;;
        return &quot;&quot; +
          &quot;&lt;a href=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;&quot; +
          &quot; , &quot;'&quot; , &quot; onclick=&quot;readAllNotification(event,&quot; , &quot;'&quot; , &quot; + idsAsParameter + &quot; , &quot;'&quot; , &quot;)&quot;>&quot; , &quot;'&quot; , &quot; +
          &quot; , &quot;'&quot; , &quot;Mark all as read&quot; , &quot;'&quot; , &quot; + &quot;&lt;/a>&quot;;
      }

      function buildNotificationRow(row) {
        return &quot;&quot; +
          &quot;&lt;li>&quot; +
          &quot;&lt;a href=&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;&quot; +
          &quot; , &quot;'&quot; , &quot; onclick=&quot;readNotification(event,&quot; , &quot;'&quot; , &quot; + row.id + &quot; , &quot;'&quot; , &quot;)&quot;&quot; , &quot;'&quot; , &quot; +
          (row.unread ? &quot; class=&quot; , &quot;'&quot; , &quot;unread&quot; , &quot;'&quot; , &quot;&quot; : &quot; &quot;) +
          row.message + &quot;&lt;/a>&quot; +
          &quot;&lt;/li>&quot;
      }
    });
  


 
                
             
             Dashboard  
             Transactions  
             History  
             Settings  
             Log Out 
             
            
           
          
          Online players: 3143 
          
         
       &quot;))]</value>
      <webElementGuid>8264e99c-fff3-45db-974b-df4095a4dc92</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
