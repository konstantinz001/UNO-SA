var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "1850",
        "ko": "1210"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "8892",
        "ok": "8892",
        "ko": "8892"
    },
    "meanResponseTime": {
        "total": "1787",
        "ok": "1450",
        "ko": "2302"
    },
    "standardDeviation": {
        "total": "2175",
        "ok": "2417",
        "ko": "1608"
    },
    "percentiles1": {
        "total": "1195",
        "ok": "14",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "2048",
        "ok": "1808",
        "ko": "2048"
    },
    "percentiles3": {
        "total": "6464",
        "ok": "6498",
        "ko": "6389"
    },
    "percentiles4": {
        "total": "7490",
        "ok": "7783",
        "ko": "7411"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1253,
    "percentage": 41
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 119,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 478,
    "percentage": 16
},
    "group4": {
    "name": "failed",
    "count": 1210,
    "percentage": 40
},
    "meanNumberOfRequestsPerSecond": {
        "total": "44.348",
        "ok": "26.812",
        "ko": "17.536"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "1530",
        "ok": "679",
        "ko": "851"
    },
    "minResponseTime": {
        "total": "12",
        "ok": "13",
        "ko": "12"
    },
    "maxResponseTime": {
        "total": "8892",
        "ok": "8892",
        "ko": "8892"
    },
    "meanResponseTime": {
        "total": "2589",
        "ok": "2806",
        "ko": "2416"
    },
    "standardDeviation": {
        "total": "2377",
        "ok": "2846",
        "ko": "1906"
    },
    "percentiles1": {
        "total": "2032",
        "ok": "1734",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "4858",
        "ok": "5864",
        "ko": "2062"
    },
    "percentiles3": {
        "total": "6991",
        "ok": "7316",
        "ko": "6558"
    },
    "percentiles4": {
        "total": "7902",
        "ok": "8365",
        "ko": "7470"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 298,
    "percentage": 19
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 30,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 351,
    "percentage": 23
},
    "group4": {
    "name": "failed",
    "count": 851,
    "percentage": 56
},
    "meanNumberOfRequestsPerSecond": {
        "total": "22.174",
        "ok": "9.841",
        "ko": "12.333"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "1530",
        "ok": "1171",
        "ko": "359"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "7444",
        "ok": "7444",
        "ko": "2078"
    },
    "meanResponseTime": {
        "total": "985",
        "ok": "664",
        "ko": "2032"
    },
    "standardDeviation": {
        "total": "1587",
        "ok": "1689",
        "ko": "14"
    },
    "percentiles1": {
        "total": "7",
        "ok": "3",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "2020",
        "ok": "12",
        "ko": "2046"
    },
    "percentiles3": {
        "total": "4994",
        "ok": "5477",
        "ko": "2052"
    },
    "percentiles4": {
        "total": "6508",
        "ok": "6520",
        "ko": "2065"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 955,
    "percentage": 62
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 89,
    "percentage": 6
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 127,
    "percentage": 8
},
    "group4": {
    "name": "failed",
    "count": 359,
    "percentage": 23
},
    "meanNumberOfRequestsPerSecond": {
        "total": "22.174",
        "ok": "16.971",
        "ko": "5.203"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
