package com.macro.mall.common.util;

public class EmailTemplate {
    static public String REGISTRATION = "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta name=\"format-detection\" content=\"email=no\"/>\n" +
            "    <meta name=\"format-detection\" content=\"date=no\"/>\n" +
            "    <style nonce=\"o5-sqaFKx0zCFvmw-KITVA\">.awl a {\n" +
            "        color: #FFFFFF;\n" +
            "        text-decoration: none;\n" +
            "    }\n" +
            "\n" +
            "    .abml a {\n" +
            "        color: #000000;\n" +
            "        font-family: Roboto-Medium, Helvetica, Arial, sans-serif;\n" +
            "        font-weight: bold;\n" +
            "        text-decoration: none;\n" +
            "    }\n" +
            "\n" +
            "    .adgl a {\n" +
            "        color: rgba(0, 0, 0, 0.87);\n" +
            "        text-decoration: none;\n" +
            "    }\n" +
            "\n" +
            "    .afal a {\n" +
            "        color: #b0b0b0;\n" +
            "        text-decoration: none;\n" +
            "    }\n" +
            "\n" +
            "    @media screen and (min-width: 600px) {\n" +
            "        .v2sp {\n" +
            "            padding: 6px 30px 0px;\n" +
            "        }\n" +
            "\n" +
            "        .v2rsp {\n" +
            "            padding: 0px 10px;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @media screen and (min-width: 600px) {\n" +
            "        .mdv2rw {\n" +
            "            padding: 40px 40px;\n" +
            "        }\n" +
            "    } </style>\n" +
            "    <link href=\"//fonts.googleapis.com/css?family=Google+Sans\" rel=\"stylesheet\" type=\"text/css\"\n" +
            "          nonce=\"o5-sqaFKx0zCFvmw-KITVA\"/>\n" +
            "</head>\n" +
            "<body style=\"margin: 0; padding: 0;\" bgcolor=\"#FFFFFF\">\n" +
            "<table width=\"100%\" height=\"100%\" style=\"min-width: 348px;\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" lang=\"en\">\n" +
            "    <tr height=\"32\" style=\"height: 32px;\">\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "    <tr align=\"center\">\n" +
            "        <td>\n" +
            "            <div itemscope itemtype=\"//schema.org/EmailMessage\">\n" +
            "                <div itemprop=\"action\" itemscope itemtype=\"//schema.org/ViewAction\">\n" +
            "                    <link itemprop=\"url\"\n" +
            "                          href=\"https://accounts.google.com/AccountChooser?Email=casonhuang56@gmail.com&amp;continue=https://myaccount.google.com/alert/nt/1718869462186?rfn%302%26rfnc%12%26eid%0%26et%1\"/>\n" +
            "                    <meta itemprop=\"name\" content=\"Review Activity\"/>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\n" +
            "                   style=\"padding-bottom: 20px; max-width: 516px; min-width: 220px;\">\n" +
            "                <tr>\n" +
            "                    <td width=\"8\" style=\"width: 8px;\"></td>\n" +
            "                    <td>\n" +
            "                        <div style=\"border-style: solid; border-width: thin; border-color:#dadce0; border-radius: 8px; padding: 40px 20px;\"\n" +
            "                             align=\"center\" class=\"mdv2rw\"><img\n" +
            "                                src=\"https://www.gstatic.com/images/branding/googlelogo/2x/googlelogo_color_74x24dp.png\"\n" +
            "                                width=\"74\" height=\"24\" aria-hidden=\"true\" style=\"margin-bottom: 16px;\" alt=\"Google\">\n" +
            "                            <div style=\"font-family: &#39;Google Sans&#39;,Roboto,RobotoDraft,Helvetica,Arial,sans-serif;border-bottom: thin solid #dadce0; color: rgba(0,0,0,0.87); line-height: 32px; padding-bottom: 24px;text-align: center; word-break: break-word;\">\n" +
            "                                <div style=\"font-size: 24px;\">Verify your email account</div>\n" +
            "                            </div>\n" +
            "                            <div style=\"font-family: Roboto-Regular,Helvetica,Arial,sans-serif; font-size: 14px; color: rgba(0,0,0,0.87); line-height: 20px;padding-top: 20px; text-align: left;\">\n" +
            "                                Sunshine-sky received a request to use <a style=\"font-weight: bold;\">#{send_email}</a>\n" +
            "                                as a registration / find password Account.<br><br>Use this code to complete account service(s) for\n" +
            "                                this email:<br>\n" +
            "                                <div style=\"text-align: center; font-size: 36px; margin-top: 20px; line-height: 44px;\">\n" +
            "                                    #{verify_code}\n" +
            "                                </div>\n" +
            "                                <br>This code will expire in 30 mins.<br><br>Please do not tell anyone the CAPTCHA.\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                        <div style=\"text-align: left;\">\n" +
            "                            <div style=\"font-family: Roboto-Regular,Helvetica,Arial,sans-serif;color: rgba(0,0,0,0.54); font-size: 11px; line-height: 18px; padding-top: 12px; text-align: center;\">\n" +
            "                                <div>You received this email to let you know about important changes to your\n" +
            "                                    Account and services.\n" +
            "                                </div>\n" +
            "                                <div style=\"direction: ltr;\">&copy; 2024 Sunshine sky Ltd.</div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </td>\n" +
            "                    <td width=\"8\" style=\"width: 8px;\"></td>\n" +
            "                </tr>\n" +
            "            </table>\n" +
            "        </td>\n" +
            "    </tr>\n" +
            "    <tr height=\"32\" style=\"height: 32px;\">\n" +
            "        <td></td>\n" +
            "    </tr>\n" +
            "</table>\n" +
            "</body>\n" +
            "</html>";
}
