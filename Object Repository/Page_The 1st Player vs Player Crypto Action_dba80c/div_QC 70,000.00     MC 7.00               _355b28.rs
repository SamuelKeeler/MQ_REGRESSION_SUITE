<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_QC 70,000.00     MC 7.00               _355b28</name>
   <tag></tag>
   <elementGuidId>5e7d963d-2413-4f49-ba2e-508e398d6796</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//header[@id='header']/nav/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.header-top</value>
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
      <webElementGuid>56e22350-8f28-45b6-86e1-6eb0eae198cb</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>header-top</value>
      <webElementGuid>e7c3b1f9-4d38-4609-8075-f1c04a6d4043</webElementGuid>
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
      <webElementGuid>7a71af18-a08a-4a4d-9e98-0b45be1080a6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;header&quot;)/nav[@class=&quot;navbar fixed&quot;]/div[@class=&quot;header-top&quot;]</value>
      <webElementGuid>b546e47d-5ddd-4696-b42d-e99db0dd4de8</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>489e4b9d-5054-4a1f-b98a-ef2b191ec406</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>user-menu-section</value>
      <webElementGuid>5ece8f18-4a99-4a5b-a5ee-cd61b7a87abe</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
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
             
            
           
          
          Online players: 2711 
          
         
       </value>
      <webElementGuid>655daffa-3273-42d9-9fb6-d8a66b88566b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;header&quot;)/nav[@class=&quot;navbar fixed&quot;]/div[@class=&quot;header-top&quot;]/div[@class=&quot;container&quot;]/div[@class=&quot;user-menu-section-wrapper&quot;]/div[@class=&quot;user-menu-section&quot;]</value>
      <webElementGuid>e3b43ac1-3897-438b-96f2-55083be6e448</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//header[@id='header']/nav/div</value>
      <webElementGuid>20070dbc-1b82-48bc-8f15-38db8fdf6f83</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//nav/div</value>
      <webElementGuid>c6423f2b-a63b-4b50-a620-1c35cc0a95e7</webElementGuid>
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
      <webElementGuid>e044d178-b11b-43c5-a790-15ab0e825197</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//header[@id='header']/nav/div/div/div[2]/div</value>
      <webElementGuid>d1482580-eb67-4b4a-a293-9538843ba45f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[2]/div</value>
      <webElementGuid>da9332a4-39f9-43a6-b44a-9ff70da6409b</webElementGuid>
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
             
            
           
          
          Online players: 2711 
          
         
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
             
            
           
          
          Online players: 2711 
          
         
       &quot;))]</value>
      <webElementGuid>957513b5-a895-4138-837c-cf653506db94</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
