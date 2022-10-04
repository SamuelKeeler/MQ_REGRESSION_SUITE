<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_QC 70,000.00     MC 7.00               _355b28_1</name>
   <tag></tag>
   <elementGuidId>d6b71c96-192a-4ac5-a533-0707327a1fc8</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//header[@id='header']/nav/div/div</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.container</value>
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
      <webElementGuid>1b3f8ce9-3ef8-4815-a1ae-aa03e3d2582a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container</value>
      <webElementGuid>64adc24d-c150-4385-aced-6667bfdb0973</webElementGuid>
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
      <webElementGuid>07bea331-985c-4c75-89ca-5918cee1ec92</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;header&quot;)/nav[@class=&quot;navbar fixed&quot;]/div[@class=&quot;header-top&quot;]/div[@class=&quot;container&quot;]</value>
      <webElementGuid>08885f3c-cd19-4200-ad47-3176f3c83b18</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//header[@id='header']/nav/div/div</value>
      <webElementGuid>caa1ea1c-ce17-4537-9c71-1d8e007250a0</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div</value>
      <webElementGuid>8b42d88d-5633-4e5b-b08e-aa1999b2aef6</webElementGuid>
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
      <webElementGuid>fefd358f-aad8-4bc1-adaf-3d3a103570e8</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
