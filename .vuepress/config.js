const baseHref = !process.env.BASE_HREF ? '/' : process.env.BASE_HREF;
module.exports = {
    head: [
        ['link', { rel: 'icon', href: '/favicon.ico' }]
    ],
    base: baseHref,
    themeConfig: {
        repo: 'daggerok/gradle-scala-application-howto',
        lastUpdated: 'Last Updated',
    },
};
