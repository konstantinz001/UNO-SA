var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10670",
        "ok": "7133",
        "ko": "3537"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "40934",
        "ok": "39912",
        "ko": "40934"
    },
    "meanResponseTime": {
        "total": "1475",
        "ok": "779",
        "ko": "2879"
    },
    "standardDeviation": {
        "total": "4135",
        "ok": "3259",
        "ko": "5217"
    },
    "percentiles1": {
        "total": "45",
        "ok": "30",
        "ko": "2200"
    },
    "percentiles2": {
        "total": "2046",
        "ok": "176",
        "ko": "2605"
    },
    "percentiles3": {
        "total": "5774",
        "ok": "3371",
        "ko": "9021"
    },
    "percentiles4": {
        "total": "32032",
        "ok": "11145",
        "ko": "35073"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 6119,
    "percentage": 57
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 225,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 789,
    "percentage": 7
},
    "group4": {
    "name": "failed",
    "count": 3537,
    "percentage": 33
},
    "meanNumberOfRequestsPerSecond": {
        "total": "36.793",
        "ok": "24.597",
        "ko": "12.197"
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
        "total": "5335",
        "ok": "2025",
        "ko": "3310"
    },
    "minResponseTime": {
        "total": "27",
        "ok": "27",
        "ko": "27"
    },
    "maxResponseTime": {
        "total": "40934",
        "ok": "39912",
        "ko": "40934"
    },
    "meanResponseTime": {
        "total": "2687",
        "ok": "2278",
        "ko": "2937"
    },
    "standardDeviation": {
        "total": "5547",
        "ok": "5773",
        "ko": "5389"
    },
    "percentiles1": {
        "total": "2031",
        "ok": "35",
        "ko": "2242"
    },
    "percentiles2": {
        "total": "2586",
        "ok": "1939",
        "ko": "2641"
    },
    "percentiles3": {
        "total": "10030",
        "ok": "10479",
        "ko": "9322"
    },
    "percentiles4": {
        "total": "36897",
        "ok": "38310",
        "ko": "35258"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1358,
    "percentage": 25
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 64,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 603,
    "percentage": 11
},
    "group4": {
    "name": "failed",
    "count": 3310,
    "percentage": 62
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.397",
        "ok": "6.983",
        "ko": "11.414"
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
        "total": "5335",
        "ok": "5108",
        "ko": "227"
    },
    "minResponseTime": {
        "total": "0",
        "ok": "0",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "33275",
        "ok": "33275",
        "ko": "2093"
    },
    "meanResponseTime": {
        "total": "263",
        "ok": "185",
        "ko": "2033"
    },
    "standardDeviation": {
        "total": "709",
        "ok": "616",
        "ko": "14"
    },
    "percentiles1": {
        "total": "3",
        "ok": "2",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "160",
        "ok": "135",
        "ko": "2047"
    },
    "percentiles3": {
        "total": "1925",
        "ok": "1147",
        "ko": "2062"
    },
    "percentiles4": {
        "total": "2062",
        "ok": "1596",
        "ko": "2063"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4761,
    "percentage": 89
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 161,
    "percentage": 3
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 186,
    "percentage": 3
},
    "group4": {
    "name": "failed",
    "count": 227,
    "percentage": 4
},
    "meanNumberOfRequestsPerSecond": {
        "total": "18.397",
        "ok": "17.614",
        "ko": "0.783"
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
