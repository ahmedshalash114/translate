/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gtranslate.parse;

import com.gtranslate.URLCONSTANTS;
import com.gtranslate.parsing.Parse;
import com.gtranslate.text.Text;
import com.gtranslate.utils.WebUtils;

public class ParseTextDetect implements Parse {
        private StringBuilder url;
        private Text input;

        public ParseTextDetect(Text input) {
                this.input = input;
        }

        @Override
        public void appendURL() {

                url = new StringBuilder(URLCONSTANTS.GOOGLE_TRANSLATE_DETECT);
                url.append("v=1.0&");
                url.append("q=" + input.getLanguage().replace(" ", "%20"));

        }

        @Override
        public void parse() {

                appendURL();
                String result = WebUtils.source(url.toString());
                input.setLanguage(result.split(",")[0].split(":")[2].replace("\"", ""));

        }

}
