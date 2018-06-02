# SymphonyLearnathon

Dependencies
- Heroku Account (For deploying)
- Heroku CLI (For deploying)
- Maven
- Java 8
- Git 

Deploying
https://devcenter.heroku.com/articles/getting-started-with-java#introduction


# Instructions from Symphony

Logging into your user account for the first time:

https://develop2.symphony.com/

username: the email @ you registered with
password: please use the password reset functionality

Note :
Web RTC (audio/video/screensharing) has been enabled on the pod, so you can have remote team meetings too
You can also point the Android or iOS apps (free to download) to this pod.
Let me know if you would like also to use the new Electron Desktop client (MacOS, win 32, win64) - currently in BETA
otherwise you need chrome version 61 or above.

## Support

I’ll be creating a chat room on the pod with all members and the Symphony Platform Solution Team to support you should you have questions. Alternatively email at platformsolutions@symphony.com (not our favorite medium obviously!)

The pod version with Symphony 1.51 (being deployed in prod this coming weekend for most of you)

## API calls

https://develop2-api.symphony.com:8444/sessionauth/v1/authenticate
https://develop2-api.symphony.com:8444/keyauth/v1/authenticate
https://develop2.symphony.com/

You have access to all APIs (REST, Extension, Integration, Embedded) 

## Service Accounts

You have been assigned 1 services account per person for the period that leads to the event so you can test the connections, try the APIs, start coding awesome bots/apps/integrations if you wish

the username of the bot account is bot.userXX when XX is a number.

Attached are the certificates and keys required to connect to the service account. the CN of the cert matches the service account username. The Service accounts have User_provisioning and Content_management rights (be mindful before starting infinity loops!). 

To avoid development collision, stick to your service account if you are testing things. Please be very mindful, when building bots listening in a room that it doesn’t start replying to itself or 2 or more bot have an uncontrolled conversation, that will affect everyone’s performance (about 100 people on this pod), abusers will get their access revoked.

On the day of the Hackathon (June 5th) please use only one Service Account for your development, the one assigned to your team lead (or yourself if you are a one man band).

The certificates password is: changeit

## A few URLs to help

For those who would like to ask live questions, we will be holding 2 more webinars: Wed 23rd May 9:30am HK/SG 10:30am Tokyo and 30th of May 10:00 HK/SG. Please register here: https://go.symphony.com/mandatory-symphony-innovate-asia-hackathon-webinar-1

## API doc

https://developer-docs.symphony.com/

### Yaml 
https://github.com/symphonyoss/symphony-api-spec/tree/rc-current-r51

### Github repos
https://github.com/symphonyoss (python client and examples here)
https://github.com/symphonysa
https://github.com/symphonyplatformsolutions

### SY clients (C#, Java, Node.js) and bot generator, how to start guide etc.
https://symphony-developers.symphony.com/docs

### How to test your MessageML and see it rendered in PresentationML or markdown (Mobile) without coding
examples of complex formatting
http://renderer-tool.app.symphony.com/

### Some ideas/examples you may have seen, with demo and link to the repo
https://workflow.symphony.com/#/

