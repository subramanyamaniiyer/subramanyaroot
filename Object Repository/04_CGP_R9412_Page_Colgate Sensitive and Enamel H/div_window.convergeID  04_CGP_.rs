<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_window.convergeID  04_CGP_</name>
   <tag></tag>
   <elementGuidId>1b74471c-a09f-40af-ab2e-c57198bf8d09</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>trm-module-2</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    window.convergeID = '04_CGP_R9412_Colgate';
    window.TrackingID = '04_CGP_R9412_Colgate';
    window.adobeTag = &quot;true&quot;; 
    var domain = window.location.host;
    var loaderUrl;

    if (!String.prototype.endsWith) {
        String.prototype.endsWith = function(searchString, position) {
            var subjectString = this.toString();
            if (typeof position !== 'number' || !isFinite(position) || Math.floor(position) !== position || position > subjectString.length) {
                position = subjectString.length;
            }
            position -= searchString.length;
            var lastIndex = subjectString.indexOf(searchString, position);
            return lastIndex !== -1 &amp;&amp; lastIndex === position;
        };
    }

    function getScript(source, callback) {
        var script = document.createElement('script');
        var prior = document.getElementsByTagName('script')[0];
        script.async = 1;
        prior.parentNode.insertBefore(script, prior);

        script.onload = script.onreadystatechange = function(_, isAbort) {
            if (isAbort || !script.readyState || /loaded|complete/.test(script.readyState)) {
                script.onload = script.onreadystatechange = null;
                script = undefined;

                if (!isAbort) {
                    if (callback) callback();
                }
            }
        };

        script.src = source;
    }

    if (domain.endsWith('cvs.com')) {
        loaderUrl = '/bizcontent/digitalsupplierprograms/shop-assets/global/js/trm-loader-v04.js';
        console.log('loaderUrl = ' + loaderUrl);
    } else {
        loaderUrl = '/shop-assets/global/js/trm-loader-v04.js';
        console.log('loaderUrl = ' + loaderUrl);
    }

    getScript(loaderUrl);
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;trm-page-wrap&quot;]/div[@class=&quot;trm-width-lock trm-grid&quot;]/div[@class=&quot;trm-body-load&quot;]/div[@class=&quot;trm-body-wrap&quot;]/div[@class=&quot;trm-module-2&quot;]</value>
   </webElementProperties>
</WebElementEntity>
