<#-- Access Liferay Service, serviceLocator must be enabled -->
<#assign
    AssetVocabularyLocalService = serviceLocator.findService("com.liferay.asset.kernel.service.AssetVocabularyLocalService") />

<#-- Show message in template, used for multilanguage -->
<@liferay_ui["message"] key="there-are-no-results" />

<#-- Print nested web content -->
<#assign webContentData=jsonFactoryUtil.createJSONObject(WebContentN1.getData()) />
<#assign jArticle = journalArticleLocalService.fetchJournalArticleByUuidAndGroupId(webContentData.uuid, themeDisplay.getScopeGroupId())>
${journalArticleLocalService.getArticleContent(themeDisplay.getScopeGroupId(),
jArticle.getArticleId(), jArticle.getVersion(), portletProviderAction.VIEW, "", localeLanguage, themeDisplay)}