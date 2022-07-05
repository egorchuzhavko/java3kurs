<?xml version="1.0" encoding="UTF-8" ?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" doctype-public="XSLT-compat" omit-xml-declaration="yes" encoding="UTF-8" indent="yes" />

    <xsl:template match="Candy">
        <hmtl>
            <head>
                <title>Candies</title>
            </head>
            <body>
                <xsl:for-each select="candy">
                    <ul>
                        <li>
                            <xsl:value-of select="name"/>
                        </li>
                        <li>
                            <xsl:value-of select="energy"/>
                        </li>
                        <li>
                            <xsl:value-of select="type"/>
                        </li>
                        <li>
                            <xsl:for-each select="ingredients">
                                <ul>
                                    <li>
                                        <xsl:value-of select="water"/>
                                    </li>
                                    <li>
                                        <xsl:value-of select="sugar"/>
                                    </li>
                                    <li>
                                        <xsl:value-of select="fruktoza"/>
                                    </li>
                                    <li>
                                        <xsl:value-of select="typechocolate"/>
                                    </li>
                                    <li>
                                        <xsl:value-of select="vanilin"/>
                                    </li>
                                </ul>
                            </xsl:for-each>
                        </li>
                        <li>
                            <xsl:for-each select="value">
                                <ul>
                                    <li>
                                        <xsl:value-of select="belki"/>
                                    </li>
                                    <li>
                                        <xsl:value-of select="jiri"/>
                                    </li>
                                    <li>
                                        <xsl:value-of select="uglevodi"/>
                                    </li>
                                </ul>
                            </xsl:for-each>
                        </li>
                        <li>
                            <xsl:value-of select="production"/>
                        </li>
                    </ul>
                    <br></br>
                </xsl:for-each>
            </body>
        </hmtl>
    </xsl:template>
</xsl:transform>
